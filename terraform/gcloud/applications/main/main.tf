provider "google" {
  project     = "coviscan-339716"
  region      = "eu-central-1"
}
terraform {
  required_providers {
    google = {
      source = "hashicorp/google"
      version = "4.8.0"
    }
    google-beta = {
      source = "hashicorp/google-beta"
      version = "4.8.0"
    }
  }

  backend "s3" {
    bucket = "coviscan-terraform"
    key    = "terraform.tfstate"
    region = "eu-central-1"
  }
}

module "cloud-run" {
  source = "../../modules/cloud-run"
}