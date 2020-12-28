package com.cykj.service;

import com.cykj.entity.Menu;

import java.util.HashMap;
import java.util.List;

public interface MenuService {
    public HashMap<String, List<Menu>> findMen(int pid);
}
