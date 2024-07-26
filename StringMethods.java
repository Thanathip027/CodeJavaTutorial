public class StringMethods {
    public static void main(String[] args) {
        String message = "Java is Great Fun";
        /* 
         เมดธอดพื้นฐาน
         1.toUperCase() ปรับค่าข้อความให้เป็นตัวพิมพ์ใหญ่
         2.tolowerCase() ปรับค่าข้อความให้เป็นพิมพ์เล็ก
         3.length() เก็บความยาวของสตริง
         4.charAt(2) บอกให้เก็บตัวอักษรตามจำนวนพารามิตเตอร์ที่ส่งเข้าไป
        */
        String upper = message.toUpperCase();
        String upper1 = message.toLowerCase();
        int upper2 = message.length();
        char upper3 = message.charAt(3);
        System.out.println(upper);
        System.out.println(upper1);
        System.out.println(upper2);
        System.out.println(upper3);
    }
}
