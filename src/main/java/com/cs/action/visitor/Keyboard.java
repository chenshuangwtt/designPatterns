
package com.cs.action.visitor;
public class Keyboard  implements ComputerPart {

   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}