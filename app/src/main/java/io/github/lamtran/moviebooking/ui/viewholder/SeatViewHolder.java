/*
 * MIT License
 *
 * Copyright (c) 2017 Lam Tran (tranngoclam288@gmail.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.github.lamtran.moviebooking.ui.viewholder;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

import io.github.lamtran.moviebooking.Seat;
import io.github.lamtran.moviebooking.databinding.ItemSeatBinding;

/**
 * Created by lam on 2/3/17.
 */

public abstract class SeatViewHolder extends RecyclerView.ViewHolder {

  public abstract void bind(Seat seat);

  public final ItemSeatBinding binding;

  public SeatViewHolder(ViewDataBinding binding) {
    super(binding.getRoot());
    this.binding = (ItemSeatBinding) binding;
  }
}
