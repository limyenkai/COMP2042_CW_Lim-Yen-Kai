package p4_group_8_repo;

import javafx.scene.image.ImageView;
import javafx.scene.input.InputEvent;

import java.util.ArrayList;


public abstract class Actor extends ImageView{
/**
 * to set the movement of the frog
 * @param dx	x axis movement of frog
 * @param dy	y axis movement of frog
 */
    public void move(double dx, double dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    /**
     * to generate world
     * @return generated world
     */
    public World getWorld() {
        return (World) getParent();
    }

    
    /**
     * Detects when frog has intersected with an object
     * @param <A>
     * @param cls
     * @return when the frog intersected with an object
     */
    public <A extends Actor> java.util.List<A> getIntersectingObjects(java.lang.Class<A> cls){
        ArrayList<A> someArray = new ArrayList<A>();
        for (A actor: getWorld().getObjects(cls)) {
            if (actor != this && actor.intersects(this.getBoundsInLocal())) {
                someArray.add(actor);
            }
        }
        return someArray;
    }

    /**
     * Detects when frog has intersected with an object
     * @param <A>
     * @param cls
     * @return when the frog intersected with an object
     */
    public <A extends Actor> A getOneIntersectingObject(java.lang.Class<A> cls) {
        ArrayList<A> someArray = new ArrayList<A>();
        for (A actor: getWorld().getObjects(cls)) {
            if (actor != this && actor.intersects(this.getBoundsInLocal())) {
                someArray.add(actor);
                break;
            }
        }
        return someArray.get(0);
    }

    public abstract void act(long now);

}