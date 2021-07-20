<template>
  <header class="scroll-to-fixed-fixed" style="z-index: 1000; position: fixed; top: 0px; margin-left: 0px; width: 100%; left: 0px;">
    <div class="navbar navbar-default" role="navigation">
      <div class="container" style="display: block">
        <div class="navbar-header">
          <a class="navbar-brand navbar-left" href="#">E . T . C</a>
          <a class="navbar-brand" style="font-size: 17px;" href="#menu-features">Team</a>
          <a class="navbar-brand" style="font-size: 17px;" href="#menu-information">Match</a>
          <a class="navbar-brand" style="font-size: 17px;" href="#menu-countdown">League</a>
          <a class="navbar-brand" style="font-size: 17px;" href="#menu-price">Board</a>
          <a class="navbar-brand" style="font-size: 17px;" href="#menu-testimonial">Forecast</a>
        </div>
        <div style="float:right" v-if="this.$cookies.get('accessToken') == null">
          <button type="button" @click="signin"><span>Sign In</span></button>
          <button type="button" @click="register"><span>Sign up</span></button>
        </div>
        <div style="float:right" v-else>
          <span style="color: white">{{login_id}}</span>
          <span  style="color: white">회원님 Welcome!  환영합니다! </span>
          <button type="button" @click="signout"><span >Sign Out</span></button>
          <button type="button"><span >MyPage</span></button>
        </div>
        <!--/.nav-collapse -->
      </div>
    </div>
  </header>
</template>

<script>
export default {
  name: "NavigationBar"
}
</script>

<style scoped>
@import "../css/style.css";

</style>
