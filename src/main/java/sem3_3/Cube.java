package sem3_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cube {
    private Integer size;
    private String color;
    private String material;

    public int getVolume(){
        return size*size*size;
    }
}
