package bai1;

public class DanOng {
    private String name;
    private VaiTro vaiTro;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VaiTro getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(VaiTro vaiTro) {
        this.vaiTro = vaiTro;
    }

    @Override
    public String toString() {
        return "DanOng{" +
                "name='" + name + '\'' +
                ", vaiTro=" + vaiTro.thucHienVaiTro() +
                '}';
    }
}
