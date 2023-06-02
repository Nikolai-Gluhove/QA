package org.example.functionInterfaces;

public class NewFunctionImpl implements IMyFunction{

    @Override
    public boolean check(int a) {
        return a % 2 == 0;
    }
}
