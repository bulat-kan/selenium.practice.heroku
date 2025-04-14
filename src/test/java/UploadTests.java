import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadTests extends BaseTest{

    @Test
    public void shouldUploadFile(){
        var uploadPage = homePage.load().clickFileUpload();
        uploadPage.uploadFile("/Users/bulatshukanov/Downloads/upload.txt");
        Assert.assertEquals(uploadPage.getUploadOutcomeMessage(), "File Uploaded!", "incorrect message");
    }

}
