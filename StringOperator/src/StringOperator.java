/**
 * @Auther: Wang Chong
 * @Description:
 * @Date: Created on 2017/1/17.
 * @Modified by:
 */
public class StringOperator {

    public static Boolean removeChar(String fileName, String regex, String replacement, String outputFileName) {
        String source = FileOperator.readFileByChar("D:\\Test\\UnitTest\\" + fileName);
        String result = source.replaceAll(regex, replacement);
        return FileOperator.writeFile(result, "D:\\Test\\UnitTest\\" + outputFileName);
    }

    public static void getMobile() {
        System.out.println("开始时间" + System.currentTimeMillis());
        String source = FileOperator.readFileByChar("C:\\Users\\puhui\\Desktop\\xupeixi2222.txt");
        String[] mobiles = source.split(",");
        System.out.println("结束时间" + System.currentTimeMillis());
        System.out.println(mobiles.length);
    }
}
