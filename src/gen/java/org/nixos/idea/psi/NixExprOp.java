// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NixExprOp extends PsiElement {

  @Nullable
  NixBoolExpr getBoolExpr();

  @Nullable
  NixExprOp getExprOp();

  @Nullable
  NixLogical getLogical();

  @Nullable
  NixUnaryOp getUnaryOp();

}
