package hero.map;

import hero.gfx.SpriteLibrary;
import hero.gfx.Tile;
import hero.misc.Size;

import java.util.Arrays;

public class GameMap {
    private Tile[][] tiles;

    public GameMap(Size size, SpriteLibrary spriteLibrary){
        tiles = new Tile[size.getWidth()][size.getHeight()];
        initTiles(spriteLibrary);
    }

    private void initTiles(SpriteLibrary spriteLibrary) {
        for(Tile[] row : tiles){
            Arrays.fill(row, new Tile(spriteLibrary));
        }
    }

    public Tile[][] getTiles(){ return tiles; }

}
