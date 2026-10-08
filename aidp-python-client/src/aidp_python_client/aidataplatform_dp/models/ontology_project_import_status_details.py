# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyProjectImportStatusDetails(object):
    """
    Import-specific progress details for an ontology project import status.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyProjectImportStatusDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param total_file_count:
            The value to assign to the total_file_count property of this OntologyProjectImportStatusDetails.
        :type total_file_count: int

        :param parsed_file_count:
            The value to assign to the parsed_file_count property of this OntologyProjectImportStatusDetails.
        :type parsed_file_count: int

        :param processed_file_count:
            The value to assign to the processed_file_count property of this OntologyProjectImportStatusDetails.
        :type processed_file_count: int

        :param error_message:
            The value to assign to the error_message property of this OntologyProjectImportStatusDetails.
        :type error_message: str

        """
        self.swagger_types = {
            'total_file_count': 'int',
            'parsed_file_count': 'int',
            'processed_file_count': 'int',
            'error_message': 'str'
        }

        self.attribute_map = {
            'total_file_count': 'totalFileCount',
            'parsed_file_count': 'parsedFileCount',
            'processed_file_count': 'processedFileCount',
            'error_message': 'errorMessage'
        }

        self._total_file_count = None
        self._parsed_file_count = None
        self._processed_file_count = None
        self._error_message = None

    @property
    def total_file_count(self):
        """
        Gets the total_file_count of this OntologyProjectImportStatusDetails.
        Total number of expanded Turtle files accepted for this import.


        :return: The total_file_count of this OntologyProjectImportStatusDetails.
        :rtype: int
        """
        return self._total_file_count

    @total_file_count.setter
    def total_file_count(self, total_file_count):
        """
        Sets the total_file_count of this OntologyProjectImportStatusDetails.
        Total number of expanded Turtle files accepted for this import.


        :param total_file_count: The total_file_count of this OntologyProjectImportStatusDetails.
        :type: int
        """
        self._total_file_count = total_file_count

    @property
    def parsed_file_count(self):
        """
        Gets the parsed_file_count of this OntologyProjectImportStatusDetails.
        Number of expanded Turtle files that have completed RDF parse processing.


        :return: The parsed_file_count of this OntologyProjectImportStatusDetails.
        :rtype: int
        """
        return self._parsed_file_count

    @parsed_file_count.setter
    def parsed_file_count(self, parsed_file_count):
        """
        Sets the parsed_file_count of this OntologyProjectImportStatusDetails.
        Number of expanded Turtle files that have completed RDF parse processing.


        :param parsed_file_count: The parsed_file_count of this OntologyProjectImportStatusDetails.
        :type: int
        """
        self._parsed_file_count = parsed_file_count

    @property
    def processed_file_count(self):
        """
        Gets the processed_file_count of this OntologyProjectImportStatusDetails.
        Number of parsed Turtle files that have completed storage persistence.


        :return: The processed_file_count of this OntologyProjectImportStatusDetails.
        :rtype: int
        """
        return self._processed_file_count

    @processed_file_count.setter
    def processed_file_count(self, processed_file_count):
        """
        Sets the processed_file_count of this OntologyProjectImportStatusDetails.
        Number of parsed Turtle files that have completed storage persistence.


        :param processed_file_count: The processed_file_count of this OntologyProjectImportStatusDetails.
        :type: int
        """
        self._processed_file_count = processed_file_count

    @property
    def error_message(self):
        """
        Gets the error_message of this OntologyProjectImportStatusDetails.
        Import failure message when the status is IMPORT_FAILED.


        :return: The error_message of this OntologyProjectImportStatusDetails.
        :rtype: str
        """
        return self._error_message

    @error_message.setter
    def error_message(self, error_message):
        """
        Sets the error_message of this OntologyProjectImportStatusDetails.
        Import failure message when the status is IMPORT_FAILED.


        :param error_message: The error_message of this OntologyProjectImportStatusDetails.
        :type: str
        """
        self._error_message = error_message

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
