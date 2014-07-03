/*
  Copyright (C) Emerson Max de Medeiros Silva

  This file is part of tictactoe.

  tictactoe is free software: you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  tictactoe is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with tictactoe.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.gmail.emersonmx.tictactoe.model;

import java.util.EventListener;

interface GameListener extends EventListener {

    public void gameStart(GameEvent event);
    public void gameOver(GameEvent event);
    public void marked(GameEvent event);
    public void gameWinner(GameEvent event);
    public void gameDraw(GameEvent event);
    public void currentPlayerChanged(GameEvent event);
    public void invalidPosition(GameEvent event);
    public void positionIsNotEmpty(GameEvent event);

}