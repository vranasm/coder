<template>
  <div id="app">
    <h1>Demo for Y Soft</h1>
    <div>Example of encoding and decoding Morse Alphabet in Java Spring backend, with barebone frontend made in Vue.js.
      <br> All calls are done with axios (ajax).</div>
    <div>
      <div class="row">
        Please select a coder
        <select v-on:change="coderChange" v-model="selcoder">
          <option value="Please select coder"></option>
          <option v-for="(coder, index) in coders" :key="index" :value="coder">{{coder}}</option>
        </select>
      </div>
      <div class="row">
        <div>
          <textarea v-model="src"></textarea>
        </div>
        <div class="buttons">
          <input type="button" @click="encode" value="=>">
          <input type="button" @click="decode" value="<=">
        </div>
        <div>
          <textarea v-model="result"></textarea>
        </div>
      </div>
      <div class="row">
        <div>
          Direct conversion page
          <table>
            <tr>
              <th>Alphabet</th>
              <th>Coded</th>
            </tr>
            <tr v-for="(value, index) in directPage" :key="index">
              <td>{{index}}</td>
              <td>{{value}}</td>

            </tr>
          </table>
        </div>
        <div>
          Advice page
          <table>
            <tr>
              <th>Alphabet</th>
              <th>Advice</th>
            </tr>
            <tr v-for="(value, index) in advicePage" :key="index">
              <td>{{index}}</td>
              <td>{{value}}</td>

            </tr>
          </table>
        </div>
        <div>
          Reverse conversion page
          <table>
            <tr>
              <th>Coded</th>
              <th>Alphabet</th>
            </tr>
            <tr v-for="(value, index) in reversePage" :key="index">
              <td>{{index}}</td>
              <td>{{value}}</td>

            </tr>
          </table>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  import axios from 'axios'

  export default {
    data() {
      return {
        src: 'Sample text',
        result: '',
        selcoder: '',
        coders: ['temp'],
        directPage: {},
        reversePage: {},
        advicePage: {}
      }
    },
    methods: {
      encode() {
        let data = {
          'req': this.src
        }
        axios.post("http://localhost:8080/api/coders/" + this.selcoder + "/encode", data).then(response => {
          console.log(response)
          this.result = response.data
        }).catch(error => {
          console.log(error)
        })
      },
      decode() {
        let data = {
          'req': this.result
        }
        axios.post("http://localhost:8080/api/coders/" + this.selcoder + "/decode", data).then(response => {
          console.log(response)
          this.src = response.data
        }).catch(error => {
          console.log(error)
        })

      },
      coderChange() {
        console.log('here')
        axios.get("http://localhost:8080/api/coders/" + this.selcoder + "/direct").then(response => {
          console.log(response)
          this.directPage = response.data
        }).catch(error => {
          console.log(error)
        })
        axios.get("http://localhost:8080/api/coders/" + this.selcoder + "/reverse").then(response => {
          console.log(response)
          this.reversePage = response.data
        }).catch(error => {
          console.log(error)
        })
        axios.get("http://localhost:8080/api/coders/" + this.selcoder + "/advice").then(response => {
          console.log(response)
          this.advicePage = response.data
        }).catch(error => {
          console.log(error)
        })
      }
    },
    mounted() {
      axios.get("http://localhost:8080/api/coders").then(response => {
        console.log(response)
        this.coders = response.data
      }).catch(error => {
        console.log(error)
      })
    }
  }

</script>

<style>
  .row {
    display: flex;
    margin: 2rem;
  }

  .buttons {
    display: block;
  }

  th,
  td {
    border: solid 1px gray;
  }

  textarea {
    width: 300px;
    height: 200px;
  }

</style>
