package com.company.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
@EqualsAndHashCode(of="id")
public class TodoItem {

   private static final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;

   // == fields ==
   private int id;
   private String title;
   private String details;
   private LocalDate deadline;

// == constructor ==
   public TodoItem(String title, String details, LocalDate deadline) {
      this.title = title;
      this.details = details;
      this.deadline = deadline;
   }
}
