package cartoon;

/**
 * This class contains all of my constants for the size and placement
 * of each shape along with the increments at which they all move.
 */

public class Constants {

    //app/cartoon constants
    public static final double SCENE_WIDTH = 1200;
    public static final double SCENE_HEIGHT = 800;
    public static final double CORNER_BOX_SPACING = 10;
    public static final double CORNER_BOX_WIDTH = 130;
    public static final double DURATION = 50;
    public static final double TOP_OF_SCREEN = -730;
    public static final double WATER_SPLASH_TOP = 430;
    public static final double WATER_SPLASH_BOTTOM = 445;
    public static final double ALTITUDE_MULTIPLIER = -1;
    public static final double LABEL_CORRECTOR = 550;

    //rocket launch constants
    public static final double ROCKET_BODY_WIDTH = 40;
    public static final double ROCKET_BODY_HEIGHT = 220;
    public static final double OG_ROCKET_BODY_X = 560;
    public static final double OG_ROCKET_BODY_Y = 460;

    public static final double OG_ROCKET_TOP_LEFT_X = 560;
    public static final double OG_ROCKET_TOP_LEFT_Y = 460;
    public static final double OG_ROCKET_TOP_RIGHT_X = 600;
    public static final double OG_ROCKET_TOP_RIGHT_Y = 460;
    public static final double OG_ROCKET_TOP_MIDDLE_X = 580;
    public static final double OG_ROCKET_TOP_MIDDLE_Y = 420;
    public static final double ROCKET_TOP_SCALE_X = 1;
    public static final double ROCKET_TOP_SCALE_Y = 1;

    public static final double ROCKET_SQUARE_WIDTH = 40;
    public static final double ROCKET_SQUARE_HEIGHT = 40;
    public static final double OG_ROCKET_SQUARE_X = 560;
    public static final double OG_ROCKET_SQUARE_Y = 540;

    public static final double OG_ROCKET_TRIANGLE_LEFT_X = 560;
    public static final double OG_ROCKET_TRIANGLE_LEFT_Y = 480;
    public static final double OG_ROCKET_TRIANGLE_RIGHT_X = 600;
    public static final double OG_ROCKET_TRIANGLE_RIGHT_Y = 480;
    public static final double OG_ROCKET_TRIANGLE_MIDDLE_X = 580;
    public static final double OG_ROCKET_TRIANGLE_MIDDLE_Y = 460;
    public static final double ROCKET_TRIANGLE_SCALE_X = 1;
    public static final double ROCKET_TRIANGLE_SCALE_Y = 1;

    public static final double ROCKET_WINDOW_RADIUS_X = 10;
    public static final double ROCKET_WINDOW_RADIUS_Y = 10;
    public static final double OG_ROCKET_WINDOW_CENTER_X = 580;
    public static final double OG_ROCKET_WINDOW_CENTER_Y = 510;

    public static final double OG_ROCKET_BOOSTER_LEFT_TOP_X = 560;
    public static final double OG_ROCKET_BOOSTER_LEFT_TOP_Y = 680;
    public static final double OG_ROCKET_BOOSTER_RIGHT_TOP_X = 600;
    public static final double OG_ROCKET_BOOSTER_RIGHT_TOP_Y = 680;
    public static final double OG_ROCKET_BOOSTER_LEFT_BOTTOM_X = 550;
    public static final double OG_ROCKET_BOOSTER_LEFT_BOTTOM_Y = 710;
    public static final double OG_ROCKET_BOOSTER_RIGHT_BOTTOM_X = 610;
    public static final double OG_ROCKET_BOOSTER_RIGHT_BOTTOM_Y = 710;
    public static final double ROCKET_BOOSTER_SCALE_X = 1;
    public static final double ROCKET_BOOSTER_SCALE_Y = 1;

    public static final double WATER_RADIUS_X = 1700;
    public static final double WATER_RADIUS_Y = 1580;
    public static final double WATER_CENTER_X = 575;
    public static final double WATER_CENTER_Y = 2000;

    public static final double GROUND_RADIUS_X = 570;
    public static final double GROUND_RADIUS_Y = 1480;
    public static final double GROUND_CENTER_X = 660;
    public static final double GROUND_CENTER_Y = 2000;

    public static final double TOWER_WIDTH = 100;
    public static final double TOWER_HEIGHT = 270;
    public static final double TOWER_X = 670;
    public static final double TOWER_Y = 410;

    public static final double ARM_WIDTH = 100;
    public static final double ARM_HEIGHT = 10;
    public static final double ARM_X = 600;
    public static final double ARM_Y = 460;

    public static final double LAUNCH_SPEED = 3;

    //rocket landing constants
    public static final double SKY_WIDTH =  1700;
    public static final double SKY_HEIGHT =  2000;
    public static final double SKY_X = 0;
    public static final double SKY_Y = 0;

    public static final double STAR_1_RADIUS_X = 5;
    public static final double STAR_1_RADIUS_Y = 5;
    public static final double STAR_2_RADIUS_X = 10;
    public static final double STAR_2_RADIUS_Y = 10;
    public static final double STAR_3_RADIUS_X = 2;
    public static final double STAR_3_RADIUS_Y = 2;
    public static final double STAR_4_RADIUS_X = 5;
    public static final double STAR_4_RADIUS_Y = 5;
    public static final double STAR_5_RADIUS_X = 10;
    public static final double STAR_5_RADIUS_Y = 10;
    public static final double OG_STAR_1_CENTER_X = 100;
    public static final double OG_STAR_1_CENTER_Y = 50;
    public static final double OG_STAR_2_CENTER_X = 300;
    public static final double OG_STAR_2_CENTER_Y = 300;
    public static final double OG_STAR_3_CENTER_X = 600;
    public static final double OG_STAR_3_CENTER_Y = 120;
    public static final double OG_STAR_4_CENTER_X = 900;
    public static final double OG_STAR_4_CENTER_Y = 400;
    public static final double OG_STAR_5_CENTER_X = 1100;
    public static final double OG_STAR_5_CENTER_Y = 140;
    public static final double MOVE_STARS_X = 10;
    public static final double STAR_APPEAR = 100;
    public static final double STAR_DISAPPEAR = 0;

    public static final double BIG_WATER_LEFT_RADIUS_X = 10;
    public static final double BIG_WATER_LEFT_RADIUS_Y = 40;
    public static final double OG_BIG_WATER_LEFT_CENTER_X = 380;
    public static final double OG_BIG_WATER_LEFT_CENTER_Y = 475;
    public static final double BIG_WATER_LEFT_ROTATE = 315;
    public static final double BIG_WATER_RIGHT_RADIUS_X = 10;
    public static final double BIG_WATER_RIGHT_RADIUS_Y = 40;
    public static final double OG_BIG_WATER_RIGHT_CENTER_X = 460;
    public static final double OG_BIG_WATER_RIGHT_CENTER_Y = 465;
    public static final double BIG_WATER_RIGHT_ROTATE = 45;
    public static final double LITTLE_WATER_1_RADIUS_X = 8;
    public static final double LITTLE_WATER_1_RADIUS_Y = 8;
    public static final double OG_LITTLE_WATER_1_CENTER_X = 330;
    public static final double OG_LITTLE_WATER_1_CENTER_Y = 465;
    public static final double LITTLE_WATER_2_RADIUS_X = 5;
    public static final double LITTLE_WATER_2_RADIUS_Y = 5;
    public static final double OG_LITTLE_WATER_2_CENTER_X = 385;
    public static final double OG_LITTLE_WATER_2_CENTER_Y = 445;
    public static final double LITTLE_WATER_3_RADIUS_X = 7;
    public static final double LITTLE_WATER_3_RADIUS_Y = 7;
    public static final double OG_LITTLE_WATER_3_CENTER_X = 500;
    public static final double OG_LITTLE_WATER_3_CENTER_Y = 455;
    public static final double WATER_SPLASH_SPEED = 8;

    public static final double LANDING_BODY_WIDTH = 80;
    public static final double LANDING_BODY_HEIGHT = 40;
    public static final double OG_LANDING_BODY_X = 380;
    public static final double OG_LANDING_BODY_Y = -40;

    public static final double OG_LANDING_TOP_LEFT_X = 380;
    public static final double OG_LANDING_TOP_LEFT_Y = -40;
    public static final double OG_LANDING_TOP_RIGHT_X = 460;
    public static final double OG_LANDING_TOP_RIGHT_Y = -40;
    public static final double OG_LANDING_TOP_MIDDLE_X = 420;
    public static final double OG_LANDING_TOP_MIDDLE_Y = -110;
    public static final double LANDING_TOP_SCALE_X = 1;
    public static final double LANDING_TOP_SCALE_Y = 1;

    public static final double OG_LANDING_TRIANGLE_LEFT_X = 380;
    public static final double OG_LANDING_TRIANGLE_LEFT_Y = 0;
    public static final double OG_LANDING_TRIANGLE_RIGHT_X = 460;
    public static final double OG_LANDING_TRIANGLE_RIGHT_Y = 0;
    public static final double OG_LANDING_TRIANGLE_MIDDLE_X = 420;
    public static final double OG_LANDING_TRIANGLE_MIDDLE_Y = -40;
    public static final double LANDING_TRIANGLE_SCALE_X = 1;
    public static final double LANDING_TRIANGLE_SCALE_Y = 1;

    public static final double LEFT_PARACHUTE_BOTTOM_RADIUS_X = 60;
    public static final double LEFT_PARACHUTE_BOTTOM_RADIUS_Y = 20;
    public static final double OG_LEFT_PARACHUTE_BOTTOM_CENTER_X = 320;
    public static final double OG_LEFT_PARACHUTE_BOTTOM_CENTER_Y = -120;

    public static final double RIGHT_PARACHUTE_BOTTOM_RADIUS_X = 60;
    public static final double RIGHT_PARACHUTE_BOTTOM_RADIUS_Y = 20;
    public static final double OG_RIGHT_PARACHUTE_BOTTOM_CENTER_X = 520;
    public static final double OG_RIGHT_PARACHUTE_BOTTOM_CENTER_Y = -120;

    public static final double OG_LEFT_PARACHUTE_TOP_CENTER_X = 320;
    public static final double OG_LEFT_PARACHUTE_TOP_CENTER_Y = -120;
    public static final double LEFT_PARACHUTE_TOP_RADIUS_X = 60;
    public static final double LEFT_PARACHUTE_TOP_RADIUS_Y = 80;
    public static final double LEFT_PARACHUTE_TOP_START_ANGLE = 0;
    public static final double LEFT_PARACHUTE_TOP_LENGTH = 180;

    public static final double OG_RIGHT_PARACHUTE_TOP_CENTER_X = 520;
    public static final double OG_RIGHT_PARACHUTE_TOP_CENTER_Y = -120;
    public static final double RIGHT_PARACHUTE_TOP_RADIUS_X = 60;
    public static final double RIGHT_PARACHUTE_TOP_RADIUS_Y = 80;
    public static final double RIGHT_PARACHUTE_TOP_START_ANGLE = 0;
    public static final double RIGHT_PARACHUTE_TOP_LENGTH =180;

    public static final double OG_LEFT_TETHER_START_X = 320;
    public static final double OG_LEFT_TETHER_START_Y = -140;
    public static final double OG_LEFT_TETHER_END_X = 420;
    public static final double OG_LEFT_TETHER_END_Y = -40;

    public static final double OG_RIGHT_TETHER_START_X = 520;
    public static final double OG_RIGHT_TETHER_START_Y = -140;
    public static final double OG_RIGHT_TETHER_END_X = 420;
    public static final double OG_RIGHT_TETHER_END_Y = -40;

    public static final double LANDING_SPEED = 3;
}