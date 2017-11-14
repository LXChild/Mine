import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: Wang Chong
 * @Description:
 * @Date: Created on 2017/1/17.
 * @Modified by:
 */
public class Main {
    private static volatile Integer a = 0;

    public static void main(String[] args) {
//        StringOperator.removeChar("source.txt", "`", "", "result.txt");
//        Boolean result = StringOperator.removeChar("result.txt", "CHARACTER SET utf8 COLLATE utf8_general_ci NULL ", "", "result.txt");
//        if (result) {
//            System.out.println("写入文件成功！");
//        } else {
//            System.out.println("写入文件失败！");
//        }

//        StringOperator.getMobile();
//        File file = new File("C:\\Users\\puhui\\Desktop\\xupeixi2222.txt");
//        System.out.println("开始时间" + System.currentTimeMillis());
//        String result = txt2String(file);
//        System.out.println("结束时间" + System.currentTimeMillis());
//        String[] mobile = result.split(",");

        ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 20, 1,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(12), new ThreadPoolExecutor.DiscardOldestPolicy());

        for (int i = 0; i < 3; i++) {
            executor.execute(new ThreadPoolTask(a++));
        }
    }


    public static class ThreadPoolTask implements Runnable, Serializable {

        private static final long serialVersionUID = 0;

        private Integer data;

        public ThreadPoolTask(Integer data) {
            this.data = data;
        }

        @Override
        public void run() {
            writeFile(data + "");
        }

        public Integer getData() {
            return data;
        }
    }

    static String txt2String(File file) {
        StringBuilder result = new StringBuilder();
        String s;
        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
            //构造一个BufferedReader类来读取文件
            //使用readLine方法，一次读一行
            while ((s = br.readLine()) != null) {
                result.append(s);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    static void writeFile(String result) {
        try (FileWriter out = new FileWriter("C:\\Users\\puhui\\Desktop\\xupeixi2223.txt", true)) {
            out.write(result + ",");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

