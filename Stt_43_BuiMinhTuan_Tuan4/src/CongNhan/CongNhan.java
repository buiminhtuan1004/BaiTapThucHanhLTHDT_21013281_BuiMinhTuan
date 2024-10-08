package CongNhan;

public class CongNhan {
    private int maCN;
    private String ho;
    private String ten;
    private double soSP;

    public int getMaCN() {
        return maCN;
    }

    public void setMaCN(int maCN) {
        if (maCN <= 0) {
            throw new IllegalArgumentException("Mã công nhân phải lớn hơn 0");
        }
        this.maCN = maCN;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        if (ho == null || ho.trim().isEmpty()) {
            throw new IllegalArgumentException("Họ không được để trống");
        }
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if (ten == null || ten.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên không được để trống");
        }
        this.ten = ten;
    }

    public double getSoSP() {
        return soSP;
    }

    public void setSoSP(double soSP) {
        if (soSP <= 0) {
            throw new IllegalArgumentException("Số sản phẩm phải lớn hơn 0");
        }
        this.soSP = soSP;
    }

    public CongNhan() {
        this(0, "", "", 0);
    }

    public CongNhan(int maCN, String ho, String ten, double soSP) {
        setMaCN(maCN);
        setHo(ho);
        setTen(ten);
        setSoSP(soSP);
    }

    public CongNhan(int maCN, String ho, String ten) {
        this(maCN, ho, ten, 0);
    }

    public double tinhLuong() {
        if (soSP < 199) {
            return soSP * 0.5;
        } else if (soSP < 399) {
            return soSP * 0.55;
        } else if (soSP < 599) {
            return soSP * 0.6;
        } else {
            return soSP * 0.65;
        }
    }

    @Override
    public String toString() {
        return "Công nhân [Mã công nhân=" + maCN + ", Họ tên=" + ho + " " + ten + ", Số sản phẩm=" + soSP + ", Lương=" + tinhLuong() + "]";
    }
}
