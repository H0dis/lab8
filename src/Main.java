import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "file.txt"; // Numele fisierului

        try {
            // Citeste fisierul existent
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            StringBuilder fileContent = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }

            bufferedReader.close();


            String newLine = "linie noua.";


            FileWriter fileWriter = new FileWriter(fileName);


            fileWriter.write(fileContent.toString());


            fileWriter.write(newLine + "\n");


            fileWriter.close();

            System.out.println("Linia noua a fost adaugata");

            // Citeste fisierul modificat
            FileReader modifiedFileReader = new FileReader(fileName);
            BufferedReader modifiedBufferedReader = new BufferedReader(modifiedFileReader);

            String modifiedLine;
            System.out.println("Continutul modificat:");
            while ((modifiedLine = modifiedBufferedReader.readLine()) != null) {
                System.out.println(modifiedLine);
            }
            modifiedBufferedReader.close();
        } catch (IOException e) {
            System.out.println("A aparut o eroare la citirea/scrierea fisierului: " + e.getMessage());
        }
    }
}