package org.example.functionInterfaces;

public class FumctionImpl implements IMyFunction{
    @Override
    public boolean check(int a) {
        return a > 0;
    }
}
