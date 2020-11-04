# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Package for all inverse kinematics solvers in MoveIt"
AUTHOR = "Dave Coleman <dave@picknik.ai> Ioan Sucan <isucan@google.com> Sachin Chitta <robot.moveit@gmail.com>"
HOMEPAGE = "http://moveit.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moveit"
ROS_BPN = "moveit_kinematics"

ROS_BUILD_DEPENDS = " \
    moveit-core \
    moveit-ros-planning \
    class-loader \
    pluginlib \
    libeigen \
    tf2 \
    tf2-kdl \
    orocos-kdl \
    moveit-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    python-lxml \
    urdfdom \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    moveit-ros-planning \
    moveit-resources \
"
LDFLAGS = "-lpthread"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH ?= "branch=main"
SRC_URI = "git://github.com/ros-planning/moveit2.git;${ROS_BRANCH};protocol=https;"
SRCREV = "d8b5137ef72315603e406a2ce5215cc1b1c03eef"
S = "${WORKDIR}/git/moveit_kinematics"

# fix QA Issue: non -dev/-dbg/nativesdk- package contains symlink .so: moveit-core path 
# https://yocto.yoctoproject.narkive.com/HbIp8MGK/understanding-dev-package-contains-non-symlink
INSANE_SKIP_${PN} += "dev-so"

# fix QA Issue: QA Issue: /usr/lib/moveit_kinematics/auto_create_ikfast_moveit_plugin.sh contained in package moveit-kinematics requires /bin/bash, but no providers found in RDEPENDS_moveit-kinematics? [file-rdeps]
RDEPENDS_${PN} += "bash"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
