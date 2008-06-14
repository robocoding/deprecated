/*******************************************************************************
 * Copyright (c) 2001, 2008 Mathew A. Nelson and Robocode contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://robocode.sourceforge.net/license/cpl-v10.html
 *
 * Contributors:
 *     Pavel Savara
 *     - Initial implementation
 *******************************************************************************/

package robots;

import robocode.battle.snapshot.TurnSnapshot;
import robocode.battle.snapshot.RobotSnapshot;
import helpers.RobotTestBed;
import helpers.Assert;

/**
 * Repeatable robot possition test
 *
 * @author Pavel Savara (original)
 */
public class TestPosition extends RobotTestBed {

    public String getRobotNames() {
        return "sample.Crazy,sample.Target";
    }

    public void onTurnEnded(TurnSnapshot turnSnapshot) {
        Assert.assertTrue(turnSnapshot.getTurn() <= 2572);
        RobotSnapshot crazy = turnSnapshot.getRobots().get(0);
        RobotSnapshot target = turnSnapshot.getRobots().get(1);
        if (turnSnapshot.getTurn() == 2572) {
            Assert.assertNear(280.5541067939999, crazy.getX());
            Assert.assertNear(467.00715337600445, crazy.getY());
            Assert.assertNear(495.85159572106136, target.getX());
            Assert.assertNear(288.2519884518413, target.getY());
        }
    }
}
