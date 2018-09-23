package com.common.wrapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by tao.zeng on 2018/9/22.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageWrapper<T> implements Serializable {

    private int current;

    private int size;

    private long total;

    private T data;
}
