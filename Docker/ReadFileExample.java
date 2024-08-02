import java.io.*;

public class ReadFileExample {

    public static void main(String[] args) {

        String fileName = "example.txt"; // Replace with your file name

        String filePath = "output.txt";

        int a=Integer.parseInt(args[0]);

        int i=1;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {

                try (BufferedWriter writer = new

BufferedWriter(new FileWriter(filePath))) {

                    while (1 <= a) {

                        String content = "Print: " + i + " " + line;

                        System.out.println(content);

                        writer.write(content);

                        writer.newLine();

                        i = i + 1;

                        a = a - 1;

                    }

                } catch (IOException e) {

                    e.printStackTrace();

                }

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    }