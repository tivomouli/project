import React, { useState } from 'react';
import axios from 'axios';
import './Cosmo.css';

const Cosmo = () => {
  const [sourceId, setSourceId] = useState('');
  const [data, setData] = useState({});
  const [selectedField, setSelectedField] = useState(null);

  const fetchData = async () => {
    try {
      const response = await axios.get(`http://localhost:8086/v1/Cosmo/source/${sourceId}`);
      setData(response.data);
    } catch (error) {
      console.error('Error fetching data:', error);
      setData({});
    }
  };

  const handleSearch = async () => {
    if (sourceId.trim() !== '') {
      await fetchData();
    }
  };

  const handleButtonClick = (field) => {
    setSelectedField(field);
  };

  const renderTable = (fieldData) => {
    if (!fieldData || fieldData.length === 0) {
      return <p className="no-data">No data available for {selectedField}</p>;
    }

    return (
      <div className="table-container">
        <table>
          <thead>
            <tr>
              {Object.keys(fieldData[0]).map((key) => (
                <th key={key}>{key}</th>
              ))}
            </tr>
          </thead>
          <tbody>
            {fieldData.map((item, index) => (
              <tr key={index}>
                {Object.values(item).map((value, index) => (
                  <td key={index}>{value}</td>
                ))}
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    );
  };

  return (
    <div className="cosmo-container">
      <div className="input-container">
        <label htmlFor="sourceId">Enter Source ID:</label>
        <input
          type="text"
          id="sourceId"
          value={sourceId}
          onChange={(e) => setSourceId(e.target.value)}
          className="search-input"
        />
        <button onClick={handleSearch} className="search-button">Search</button>
      </div>
      <div className="buttons-container">
        <button className={selectedField === 'sourceBase' ? 'selected' : ''} onClick={() => handleButtonClick('sourceBase')}>Source Base</button>
        <button className={selectedField === 'sourceTvProfile' ? 'selected' : ''} onClick={() => handleButtonClick('sourceTvProfile')}>Source TV Profile</button>
        <button className={selectedField === 'ingestSourceDefaults' ? 'selected' : ''} onClick={() => handleButtonClick('ingestSourceDefaults')}>Ingest Source Defaults</button>
        <button className={selectedField === 'sourceTv' ? 'selected' : ''} onClick={() => handleButtonClick('sourceTv')}>Source TV</button>
        <button className={selectedField === 'ingestCopyTypeXref' ? 'selected' : ''} onClick={() => handleButtonClick('ingestCopyTypeXref')}>Ingest Copy Type Xref</button>
        <button className={selectedField === 'sourceProviderXref' ? 'selected' : ''} onClick={() => handleButtonClick('sourceProviderXref')}>Source Provider Xref</button>
      </div>
      {selectedField && renderTable(data[selectedField])}
    </div>
  );
};

export default Cosmo;

