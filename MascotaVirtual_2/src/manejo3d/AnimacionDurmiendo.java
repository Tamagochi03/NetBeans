/*
 * Aquí se implementan los métodos necesarios de la clase
   Transformaciones para un tamagochi que está durmiendo.
 */
package manejo3d;

import com.sun.j3d.utils.image.TextureLoader;
import java.awt.Container;
import javax.media.j3d.Background;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.ImageComponent2D;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TransformGroup;

public class AnimacionDurmiendo {
    
    Transformaciones trans;
    Shape3D shape;
    TextureLoader tex;
    ImageComponent2D imagen;
    Background background;
    BoundingSphere bounds = new BoundingSphere();
    TransformGroup Tuxcontent = new TransformGroup();
    TransformGroup Tuxtrans = new TransformGroup();
    TransformGroup grupoTrans;
    
    public AnimacionDurmiendo(TransformGroup grupoTrans) {  
        Tuxcontent.addChild(Tuxtrans);
        this.grupoTrans = grupoTrans;
        
    }
    
    public TransformGroup estadoDurmiendo() {
        trans = new Transformaciones(this.grupoTrans);
        trans.trasladarRayman();
        trans.rotarRaymanZ();
        return grupoTrans;  
    }
    
    public TransformGroup fondoDurmiendo() {
        tex = new TextureLoader("C:\\Users\\YareliS\\Documents\\NetBeansProjects\\TimoProNetBeans-master\\src\\manejo3d\\recursos\\habitacion.jpg", null);
        imagen= tex.getImage();
        background = new Background();
        background.setImage(imagen);
        background.setApplicationBounds(bounds);
        Tuxcontent.addChild(background);
        return Tuxcontent;
    }
    
    
}
