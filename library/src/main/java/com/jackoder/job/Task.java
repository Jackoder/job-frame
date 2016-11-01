package com.jackoder.job;

import java.util.List;

/**
 * @author Jackoder
 * @version 2016/11/1
 */
public abstract class Task<I, O> {

    Input  mInput;
    Output mOutput;

    List<Task> mSuccessors;

    public Task(Input<I> input, Output<O> output) {
        mInput = input;
        mOutput = output;
    }

    public abstract O run(I input) throws Exception;
}
