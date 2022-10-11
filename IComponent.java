import java.util.List;

public interface IComponent {
    int setNumberOfWindows(int windows);
    void setMaterials(String material);
    List<String> getMaterials();
}