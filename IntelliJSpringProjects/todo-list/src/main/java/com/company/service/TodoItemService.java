package com.company.service;

import com.company.model.TodoData;
import com.company.model.TodoItem;

public interface TodoItemService {

   void addItem(TodoItem itemToAdd);
   void removeItem(int id);
   TodoItem getItem(int id);
   void updateItem(TodoItem itemToUpdate);
   TodoData getData();
}
