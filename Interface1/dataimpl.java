package Interface1;

public class dataimpl implements infoService, detailService {

    @Override
    public void userDetail() {
       System.out.println("i have user details");
    }

    @Override
    public void userInfo() {
       System.out.println("i have user information");
    }
    
}
