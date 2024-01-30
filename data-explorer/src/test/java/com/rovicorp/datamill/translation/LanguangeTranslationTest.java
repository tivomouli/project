package com.rovicorp.datamill.translation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.Collator;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class LanguangeTranslationTest {
	private static final Logger logger = LoggerFactory.getLogger(LanguangeTranslationTest.class);
	
	@Test
	public void convertFrenchToEnglish() {
		String frenchPhrase = "L'AFFAIRE ROBERTO SUCCO / TUEURS AU VOLANT";
		String englishPhrase = Normalizer.normalize(frenchPhrase, Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
		
		logger.info("English Phrase: {}", englishPhrase);
	}

	@Test
	public void frenchToEnglishConversion() {
		List<String> frenchWords = Arrays.asList("étable", "le garçon", "Cheminée", "Fièvre", "fraîche", "Égoïste", "été", "Journée");
		List<String> englishWords = Arrays.asList("etable","le garcon","Cheminee","Fievre","fraiche","Egoiste", "ete", "Journee");
		List<String> convertedWords = new ArrayList<>();
		
		// Let's remove accent/grave notations
		for (String frenchWord : frenchWords) {
			convertedWords.add(Normalizer.normalize(frenchWord, Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", ""));
			//convertedWords.add(StringUtils.stripAccents(frenchWord));
		}
		
		for (short index = 0; index < englishWords.size(); index++) {
			assertEquals(englishWords.get(index), convertedWords.get(index));
		}		
	}
	
	@Test
	public void frenchToEnglishComparison() {
		List<String> frenchWords = Arrays.asList("étable", "le garçon", "Cheminée", "Fièvre", "fraîche", "Égoïste", "été", "Journée");
		List<String> englishWords = Arrays.asList("etable","le garcon","Cheminee","Fievre","fraiche","Egoiste", "ete", "Journee");
		
		Collator collator = Collator.getInstance(Locale.US);
		collator.setStrength(Collator.PRIMARY);
		
		for (short index = 0; index < frenchWords.size(); index++) {
			assertTrue(collator.equals(frenchWords.get(index), englishWords.get(index)));
		}
	}
	
	@Test
	public void identifyAccentsGraves() {
		List<String> frenchWords = Arrays.asList("étable", "le garçon", "Cheminée", "Fièvre", "fraîche", "Égoïste", "été");
		List<String> englishWords = Arrays.asList("etable","le garcon","Cheminee","Fievre","fraiche","Egoiste", "ete");
		
		Collator collator = Collator.getInstance(Locale.US);
		collator.setStrength(Collator.SECONDARY);
		
		for (short index = 0; index < frenchWords.size(); index++) {
			assertFalse(collator.equals(frenchWords.get(index), englishWords.get(index)));
		}
	}
	
	@Test
	public void identifyNoAccentsGraves() {
		List<String> frenchWords = Arrays.asList("maintenant", "lundi", "mardi", "mercredi", "jeudi", "vendredi", "dictionnaire");
		List<String> englishWords = Arrays.asList("maintenant", "lundi", "mardi", "mercredi", "jeudi", "vendredi", "dictionnaire");
		
		Collator collator = Collator.getInstance(Locale.US);
		collator.setStrength(Collator.SECONDARY);
		
		for (short index = 0; index < frenchWords.size(); index++) {
			assertTrue(collator.equals(frenchWords.get(index), englishWords.get(index)));
		}
	}
	
	@Test
	public void translateLigature()  {
		List<String> frenchWords = Arrays.asList("sœur");
		List<String> englishWords = Arrays.asList("soeur");
		
		for (short index = 0; index < frenchWords.size(); index++) {
			String replacedWord = frenchWords.get(index).replace("œ", "oe");
			
			assertEquals(replacedWord, englishWords.get(index));
			
			int ligatureIndex = frenchWords.indexOf("œ");
			if (ligatureIndex != -1) {
				assertEquals(ligatureIndex, 1);
			}
			
		}
	}
}
