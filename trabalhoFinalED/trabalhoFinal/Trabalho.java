package trabalhoFinal;

import java.util.HashMap;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
public class Trabalho {

	public static void main(String[] args) {
		ArrayList<String> tsArrayList = new ArrayList<String>();
		HashSet<String> tsHashSet = new HashSet<String>();
		HashMap<String, Integer> tsHashMap = new HashMap<String, Integer>();
		Scanner scan1 = null, scan2 = null, scan3 = null;

		
		// Carregando conteúdo do arquivo
		try {
			scan1 = new Scanner(new FileReader("/home/acsp/Documentos/trabalhoFinalED/trabalhoFinal/src/trabalhoFinal/leipzig100k.txt"));
			scan2 = new Scanner(new FileReader("/home/acsp/Documentos/trabalhoFinalED/trabalhoFinal/src/trabalhoFinal/leipzig100k.txt"));
			scan3 = new Scanner(new FileReader("/home/acsp/Documentos/trabalhoFinalED/trabalhoFinal/src/trabalhoFinal/leipzig100k.txt"));
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}

		// Inicio questão 1
		StopwatchCPU tempoArrayList= new StopwatchCPU();
		int i = 0;
		while(scan1.hasNext()) {
			String palavra = scan1.next();
			if(!tsArrayList.contains(palavra)) {
				tsArrayList.add(palavra);
				i++;
			}
		}
		Double tempoArrayListFinal = tempoArrayList.elapsedTime();
		//System.out.println("Quantidade de elementos: " + tsArrayList.size());
		// Fim questão 1
		
		
		// Inicio questão 2
		StopwatchCPU tempoHashSet= new StopwatchCPU();	
		
		i = 0;
		while(scan2.hasNext()) {
			String palavra = scan2.next();
			if(!tsHashSet.contains(palavra)) {
				tsHashSet.add(palavra);
				i++;
			}
		}
		Double tempoHashSetFinal = tempoHashSet.elapsedTime();
		//System.out.println("Quantidade de elementos: " + tsHashSet.size());
		// Fim questão 2
				
		// Inicio questão 3
		StopwatchCPU tempoHashMap= new StopwatchCPU();	
		i = 0;
		while(scan3.hasNext()) {
			String palavra = scan3.next();
			if(!tsHashMap.containsValue(palavra)) {
				tsHashMap.put(palavra, i);
				i++;
			}
		}
		Double tempoHashMapFinal = tempoHashMap.elapsedTime();
		// Fim questão 3
		
		System.out.println("Tempo de execulcao em segundos usando ArrayList: " + tempoArrayListFinal);
		System.out.println("Tempo de execulcao em segundos usando HashSet: " + tempoHashSetFinal);
		System.out.println("Tempo de execulcao em segundos usando HashMap: " + tempoHashMapFinal);
		
		// Inicio questao 4
		final String tituloQuestao4 = "Tempo de execução das aplicações";
		final String tempoQuestao4 = "Tempo";
		DefaultCategoryDataset datasetBarrasQuestao4 = new DefaultCategoryDataset();
		datasetBarrasQuestao4.addValue(tempoArrayListFinal, "ArrayList", tempoQuestao4);
		datasetBarrasQuestao4.addValue(tempoHashSetFinal, "HashSet", tempoQuestao4);
		datasetBarrasQuestao4.addValue(tempoHashMapFinal, "HashMap", tempoQuestao4);
		
		GraficoBarra graficoBarraQuestao4 = new GraficoBarra(tituloQuestao4, "", "Tempo em segundos", datasetBarrasQuestao4);
		graficoBarraQuestao4.exibirGraficoEmFrame(640, 480);
		
		// Fim questao 4
		
		// Inicio questao 5
		String palavrasQuestao5[] = {"Lisbon", "NASA", "Kyunghee", "Konkuk", "Sogang", "momentarily", "rubella", "vaccinations", "government", "Authorities"};
		
		// Inicio parte do ArrayList
		StopwatchCPU tempoDeBuscaArrayList= new StopwatchCPU();
		
		for(int j=0; j <= palavrasQuestao5.length-1; j++) {
			for(i=0;i<tsArrayList.size(); i++) {
				if(tsArrayList.contains(palavrasQuestao5[j])) {
					//System.out.println(palavrasQuestao5[j] + ": encontrada usando ArrayList");
					i++;
					break;
				}		
			}
		} 
		Double tempoDeBuscaArrayListFinal = tempoDeBuscaArrayList.elapsedTime();
		// Fim parte do ArrayList
		
		// Inicio parte do HashSet
		StopwatchCPU tempoDeBuscaHashSet= new StopwatchCPU();
		
		for(int j=0; j <= palavrasQuestao5.length-1; j++) {
			for(i=0;i<tsHashSet.size(); i++) {
				if(tsHashSet.contains(palavrasQuestao5[j])) {
					//System.out.println(palavrasQuestao5[j] + ": encontrada usando HashSet");
					i++;
					break;
				}		
			}
		} 
		Double tempoDeBuscaHashSetFinal = tempoDeBuscaHashSet.elapsedTime();
		// Fim parte do HashSet
		
		// Inicio parte do HashMap
		StopwatchCPU tempoDeBuscaHashMap= new StopwatchCPU();
		
		for(int j=0; j <= palavrasQuestao5.length-1; j++) {
			for(i=0;i<tsHashMap.size(); i++) {
				if(tsHashMap.containsKey(palavrasQuestao5[j])) {
					//System.out.println(palavrasQuestao5[j] + ": encontrada usando HashMap");
					i++;
					break;
				}		
			}
		} 
		Double tempoDeBuscaHashMapFinal = tempoDeBuscaHashMap.elapsedTime();
		
		System.out.println("Tempo de busca em segundos usando ArrayList: " + tempoDeBuscaArrayListFinal);
		System.out.println("Tempo de busca em segundos usando HashSet: " + tempoDeBuscaHashSetFinal);
		System.out.println("Tempo de busca em segundos usando HashMap: " + tempoDeBuscaHashMapFinal);
		// Fim parte do HashMap
		// Fim questao 5
		
		// Inicio questao 6
		final String tituloQuestao6 = "Tempo de execução das aplicações de busca";
		final String tempoQuestao6  = "Tempo";
		DefaultCategoryDataset datasetBarrasQuestao6 = new DefaultCategoryDataset();
		datasetBarrasQuestao6.addValue(tempoDeBuscaArrayListFinal, "ArrayList", tempoQuestao6);
		datasetBarrasQuestao6.addValue(tempoDeBuscaHashSetFinal, "HashSet", tempoQuestao6);
		datasetBarrasQuestao6.addValue(tempoDeBuscaHashMapFinal, "HashMap", tempoQuestao6);
		
		GraficoBarra graficoBarraQuestao6 = new GraficoBarra(tituloQuestao6, "", "Tempo em segundos", datasetBarrasQuestao6);
		graficoBarraQuestao6.exibirGraficoEmFrame(640, 480);
		
		// Fim questao 6
		
		// Inicio questao 7
		
		// Inicio parte do ArrayList
		StopwatchCPU tempoDeExclusaoArrayList= new StopwatchCPU();
		
		for(int j=0; j <= palavrasQuestao5.length-1; j++) {
			for(i=0;i<tsArrayList.size(); i++) {
				if(tsArrayList.contains(palavrasQuestao5[j])) {
					// System.out.println(tsArrayList.size());
					tsArrayList.remove(palavrasQuestao5[j]);
					// System.out.println(tsArrayList.size());
					i++;
					break;
				}		
			}
		} 
		Double tempoDeExclusaoArrayListFinal = tempoDeExclusaoArrayList.elapsedTime();
		// Fim parte do ArrayList
		
		// Inicio parte do HashSet
		StopwatchCPU tempoDeExclusaoHashSet= new StopwatchCPU();
		
		for(int j=0; j <= palavrasQuestao5.length-1; j++) {
			for(i=0;i<tsHashSet.size(); i++) {
				if(tsHashSet.contains(palavrasQuestao5[j])) {
					// System.out.println(tsHashSet.size());
					tsHashSet.remove(palavrasQuestao5[j]);
					// System.out.println(tsHashSet.size());
					i++;
					break;
				}		
			}
		} 
		Double tempoDeExclusaoHashSetFinal = tempoDeExclusaoHashSet.elapsedTime();
		// Fim parte do HashSet
		
		// Inicio parte do HashMap
		StopwatchCPU tempoDeExclusaoHashMap= new StopwatchCPU();
				
		for(int j=0; j <= palavrasQuestao5.length-1; j++) {
			for(i=0;i<tsHashMap.size(); i++) {
				if(tsHashMap.containsKey(palavrasQuestao5[j])) {
					// System.out.println(tsHashMap.size());
					tsHashMap.remove(palavrasQuestao5[j]);
					// System.out.println(tsHashMap.size());
					i++;
					break;
				}		
			}
		} 
		Double tempoDeExclusaoHashMapFinal = tempoDeExclusaoHashMap.elapsedTime();
		// Fim parte do HashSet
		
		System.out.println("Tempo de remoção em segundos usando ArrayList: " + tempoDeExclusaoArrayListFinal);
		System.out.println("Tempo de remoção em segundos usando HashSet: " + tempoDeExclusaoHashSetFinal);
		System.out.println("Tempo de remoção em segundos usando HashMap: " + tempoDeExclusaoHashMapFinal);
		
		// Fim questao 7
		
		// Inicio questao 8
		final String tituloQuestao8 = "Tempo de execução das aplicações de remoção";
		final String tempoQuestao8 = "Tempo";
		DefaultCategoryDataset datasetBarrasQuestao8 = new DefaultCategoryDataset();
		datasetBarrasQuestao8.addValue(tempoDeExclusaoArrayListFinal, "ArrayList", tempoQuestao8);
		datasetBarrasQuestao8.addValue(tempoDeExclusaoHashSetFinal, "HashSet", tempoQuestao8);
		datasetBarrasQuestao8.addValue(tempoDeExclusaoHashMapFinal, "HashMap", tempoQuestao8);
		
		GraficoBarra graficoBarraQuestao8 = new GraficoBarra(tituloQuestao8, "", "Tempo em segundos", datasetBarrasQuestao8);
		graficoBarraQuestao8.exibirGraficoEmFrame(640, 480);
		
		// Fim questao 8
	}

}
