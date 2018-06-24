package 原型模式;

import java.util.Random;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 12:09 2018/6/24
 * @Modified By:
 */
public class Client {
    private static int MAX_COUNT = 6;

    public static void main(String[] args) throws CloneNotSupportedException {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("中国银行版权");
        while (i < MAX_COUNT) {
            Mail clone = mail.clone();
            clone.setAppelation(getRandString(5)+"先生");
            clone.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
            sendMail(mail);
            i++;
        }
    }

    public static void sendMail(Mail mail) {
        System.out.println("标题:" + mail.getSubject() + "\t收件人" + mail.getReceiver() + "发送成功...");
    }

    public static String getRandString(int max) {
        String source = "sdfaghadahhaegsdgadfgfhadga";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < max; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
