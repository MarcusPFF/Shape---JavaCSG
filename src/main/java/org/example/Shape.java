package org.example;

import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.Vector3D;

public abstract class Shape {
    private JavaCSG csg;
    private Vector3D position;
    private Vector3D rotation;

    public Shape(JavaCSG csg, Vector3D position, Vector3D rotation) {
        this.csg = csg;
        this.position = position;
        this.rotation = rotation;
    }

    public abstract void applyPosition();

    public abstract void applyRotation();

    public abstract void view();
}
