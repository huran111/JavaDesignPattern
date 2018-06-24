package 原型模式;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 12:07 2018/6/24
 * @Modified By:
 */
public class Mail implements Cloneable {
    private String receiver;
    private String subject;
    private String appelation;
    private String contxt;
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.contxt = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    @Override
    public Mail clone() throws CloneNotSupportedException {
        Mail mail = null;
        mail = (Mail) super.clone();
        return mail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppelation() {
        return appelation;
    }

    public void setAppelation(String appelation) {
        this.appelation = appelation;
    }

    public String getContxt() {
        return contxt;
    }

    public void setContxt(String contxt) {
        this.contxt = contxt;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
