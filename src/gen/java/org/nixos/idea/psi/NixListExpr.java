// This is a generated file. Not intended for manual editing.
package org.nixos.idea.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NixListExpr extends PsiElement {

  @Nullable
  NixAttrPath getAttrPath();

  @Nullable
  NixBindOrSelect getBindOrSelect();

  @Nullable
  NixEvalOrSelect getEvalOrSelect();

  @Nullable
  NixStringParts getStringParts();

  @Nullable
  PsiElement getFnuttClose();

  @Nullable
  PsiElement getFnuttOpen();

}
