import lombok.Data;
import lombok.Getter;

@Data
public class lombok_basic {
    private int no;
    private String name;

    public static void main(String[] args) {
        lombok_basic l1 = new lombok_basic();
        l1.setName("kavi");

        System.out.println(l1.getName());
    }

}
