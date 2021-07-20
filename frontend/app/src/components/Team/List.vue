<template>
  <body>
    <b-table hover :items="items" @click:row="handleClick"></b-table>
  </body>
</template>

<script>
import axios from "axios";

export default {
  name: "List.vue",
  data() {
    return {
      fields: [
          {key: 'TeamName'},
      ],
      items: [
      ]
    }
  },
  created() {
    axios.get("http://localhost:8080/teams")
        .then(r => {
          console.log(this.convert(r.data.results));
          this.items = this.convert(r.data.results);
        })
        .catch(e => {
          console.log(e);
        })
  },
  methods: {
    handleClick(value) {
      this.viewDetails(value);
    },
    convert(results) {
      return results.reduce((acc, cur) => {
        return acc.concat([{'Team Name': cur['teamName']}])
      }, [])
    }
  }
}
</script>

<style scoped>

</style>
