/**
 * Copyright (c) 2015-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.views.art;

import android.content.Context;
import android.view.SurfaceView;

/**
 * Custom {@link View} implementation that draws an ARTSurface React view and its children.
 */
public class ARTSurfaceView extends SurfaceView {
  public ARTSurfaceView(Context context) {
    super(context);
  }
}
