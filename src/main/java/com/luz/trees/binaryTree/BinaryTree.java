package com.luz.trees.binaryTree;

import com.luz.trees.Position;
import com.luz.trees.Tree;

/**
 * Created by ionut on 8/16/2017.
 */
public interface BinaryTree<E> extends Tree<E> {
    Position<E> left(Position<E> p) throws IllegalArgumentException;
    Position<E> right(Position<E> p) throws IllegalArgumentException;
    Position<E> sibling(Position<E> p) throws IllegalArgumentException;
}
