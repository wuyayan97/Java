package Mail;

/**
 * @Author wuyayan
 * @Date 2021/12/14 17:23:00
 * @Version 1.0
 * @Description Java mail 发送 MimeMessage 邮件
 */
public class Mail {


    //邮件发送者
//    String sender = "XXXXX@qq.com";
//
//    //装配消息
//    MimeMessage mimeMessage = sender;
//    MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
//    messageHelper.setFrom(sender.getUsername(), sender.getNickname());
//    messageHelper.setTo(email);
//    messageHelper.setSubject(template.get("subject"));
//    messageHelper.setText(template.get("content"), true);
//
//    //发送
//    sender.send(mimeMessage);
    //添加图片可以成功，但是图片会裂开
    //MimeBodyPart image = new MimeBodyPart();
    //ClassPathResource cpr = new ClassPathResource("src/main/webapp/static/img/mailPic.png");
    //helper.addInline("p1", cpr.getFile());
    //image.setContentID("mailPic");

    //messageHelper.addInline("mailPic",res);
}
