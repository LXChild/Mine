import java.io.*;

/**
 * @Auther: Wang Chong
 * @Description:
 * @Date: Created on 2017/1/17.
 * @Modified by:
 */
public class FileOperator {

    public static void main(String[] args) {
        String a = " sdfsadfsa ";
        System.out.println(a.trim());

    }

    public static String readFileByChar(String fileName) {
        File file = new File(fileName);
        Reader reader;
        StringBuilder sb = new StringBuilder();

        try {
            System.out.println("Start Read >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            // 一次读一个字符
            reader = new InputStreamReader(new FileInputStream(file));
            int tempChar;
            while ((tempChar = reader.read()) != -1) {
                // 对于windows下，rn这两个字符在一起时，表示一个换行。
                // 但如果这两个字符分开显示时，会换两次行。
                // 因此，屏蔽掉r，或者屏蔽n。否则，将会多出很多空行。
                if (((char) tempChar) != '\r') {
                    sb.append(tempChar);
                }
            }
            reader.close();
            System.out.println("Stop Read >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Read Error!!!");
        }
        return sb.toString();
    }

    public static Boolean writeFile(String content, String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile(); // 创建文件
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        byte bt[];
        bt = content.getBytes();
        try {
            FileOutputStream in = new FileOutputStream(file);
            try {
                in.write(bt, 0, bt.length);
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
        try {
            // 读取文件内容 (输入流)
            FileInputStream out = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(out);
            int ch;
            while ((ch = isr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
