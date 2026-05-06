package lab1;

public class XuLyChuoi { 
    public static void main(String[] args) {
        String path = "D:/music/bolero/longme.mp3";
        
        int lastSlash = path.lastIndexOf("/");
        int lastDot = path.lastIndexOf(".");
        
        String tenFile = path.substring(lastSlash + 1);
        String tenBaiHat = path.substring(lastSlash + 1, lastDot);
        
        System.out.println("Tên file: " + tenFile);
        System.out.println("Tên bài hát: " + tenBaiHat);
    }
}