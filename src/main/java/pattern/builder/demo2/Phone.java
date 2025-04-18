package pattern.builder.demo2;

/**
 * 手機類
 */
public class Phone {

    private String cpu;
    private String screen;
    private String memory;
    private String mainBoard;

    // 私有構造方法
    private Phone(Builder builder){
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainBoard = builder.mainBoard;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                '}';
    }

    public static final class Builder{
        private String cpu;
        private String screen;
        private String memory;
        private String mainBoard;

        public Builder cpu(String cup){
            this.cpu = cup;
            return this;
        }

        public Builder screen(String screen){
            this.screen = screen;
            return this;
        }

        public Builder memory(String memory){
            this.memory = memory;
            return this;
        }

        public Builder mainBoard(String mainBoard){
            this.mainBoard = mainBoard;
            return this;
        }

        // 使用創建者創建 Phone 物件
        public Phone build(){
            return new Phone(this);
        }


    }
}
