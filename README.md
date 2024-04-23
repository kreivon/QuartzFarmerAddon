# File Encryption Utility with Discord Integration

This Python script provides a simple encryption and decryption utility for files, with an additional feature to send the encryption keys to a Discord channel via webhook.

## Functionality Overview

### Libraries Imported

- **sys**: For system-specific parameters and functions.
- **subprocess**: For executing system commands (e.g., installing Python packages).
- **pyperclip**: For accessing the clipboard to copy and paste data.
- **requests**: For making HTTP requests.
- **cryptography.fernet**: For symmetric encryption and decryption.

### Functions Defined

- **generate_key()**: Generates a random encryption key using Fernet symmetric encryption algorithm.
- **encrypt_file(file_path, key, webhook=None)**: Encrypts a file specified by file_path using the provided key. Optionally, if a Discord webhook is provided, it sends the encryption key to the specified Discord channel.
- **decrypt_file(file_path, key)**: Decrypts an encrypted file specified by file_path using the provided key.
- **send_to_discord(key, file_name, webhook)**: Sends the encryption key and file_name to a Discord channel via webhook.
- **main()**: The main function orchestrating the script execution.

### Main Functionality

- **Installation of Dependencies**: Checks if required packages (pyperclip and cryptography) are installed. If not, it attempts to install them using pip.
- **Option Selection Loop**: Allows the user to choose one of three options:
  - Use pre-set webhook.
  - Enter a webhook manually.
  - Encrypt files dropped on the script, print keys, and wait.
- **File Processing**: If the user chooses to encrypt or decrypt files, the script iterates through each specified file path.

### Encryption Process

- **Key Generation**: Generates a random encryption key using the Fernet.generate_key() function.
- **Encryption**:
  - Reads the contents of the file into memory.
  - Creates a Fernet cipher object using the encryption key.
  - Encrypts the data and writes it to a new file with the .sus extension.
  - Deletes the original unencrypted file for security purposes.

### Decryption Process

- **Read Encrypted Data**: Reads the contents of the encrypted file into memory using a binary read mode.
- **Create Fernet Cipher**: Creates a Fernet cipher object using the encryption key.
- **Decrypt Data**: Decrypts the encrypted data using the Fernet cipher object.
- **Write Decrypted Data**: Writes the decrypted data to a new file with the original file extension restored.
- **Delete Encrypted File**: Deletes the encrypted file after decryption.

### Interaction with Discord

- If a webhook is provided, the script sends the encryption keys to a Discord channel, including the encryption key and the name of the encrypted file.

### Additional Features

- Copies encryption keys to the clipboard for easy access.
- Handles errors gracefully and provides informative messages.

## Usage

1. Ensure Python and required packages are installed.
2. Run the script and follow the prompts to encrypt or decrypt files.

## Contribution

Contributions are welcome! Feel free to open issues and submit pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
