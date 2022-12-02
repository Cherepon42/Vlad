import java.io.*;

public class HW_12 {
    public static void main(String[] args) {
        File file = new File("resources/romeo-and-juliet.txt/");
        String maxStr = "";
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String str;
            while (reader.ready()) {
                str = reader.readLine();
                String[] strings = str.split("[,=?\\\\ .'!\\[]");
                for(String nextLine : strings) {
                    nextLine = nextLine.trim();
                    if(maxStr.length() < nextLine.length()) { System.out.println(nextLine);
                        maxStr = nextLine;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //neighbor-stained
        File fileResult = new File("resources/result.txt");
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileResult))) {
            writer.write(maxStr);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
