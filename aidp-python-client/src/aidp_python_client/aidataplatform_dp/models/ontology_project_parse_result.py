# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyProjectParseResult(object):
    """
    Result of parsing every Turtle source file in an ontology project through Apache Jena.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyProjectParseResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param is_successful:
            The value to assign to the is_successful property of this OntologyProjectParseResult.
        :type is_successful: bool

        :param status:
            The value to assign to the status property of this OntologyProjectParseResult.
        :type status: str

        :param revision:
            The value to assign to the revision property of this OntologyProjectParseResult.
        :type revision: str

        :param size_bytes:
            The value to assign to the size_bytes property of this OntologyProjectParseResult.
        :type size_bytes: int

        :param parsed_file_count:
            The value to assign to the parsed_file_count property of this OntologyProjectParseResult.
        :type parsed_file_count: int

        :param source_paths:
            The value to assign to the source_paths property of this OntologyProjectParseResult.
        :type source_paths: list[str]

        :param diagnostics:
            The value to assign to the diagnostics property of this OntologyProjectParseResult.
        :type diagnostics: list[oci.aidataplatform_dp.models.OntologyGraphPreviewDiagnostic]

        """
        self.swagger_types = {
            'is_successful': 'bool',
            'status': 'str',
            'revision': 'str',
            'size_bytes': 'int',
            'parsed_file_count': 'int',
            'source_paths': 'list[str]',
            'diagnostics': 'list[OntologyGraphPreviewDiagnostic]'
        }

        self.attribute_map = {
            'is_successful': 'isSuccessful',
            'status': 'status',
            'revision': 'revision',
            'size_bytes': 'sizeBytes',
            'parsed_file_count': 'parsedFileCount',
            'source_paths': 'sourcePaths',
            'diagnostics': 'diagnostics'
        }

        self._is_successful = None
        self._status = None
        self._revision = None
        self._size_bytes = None
        self._parsed_file_count = None
        self._source_paths = None
        self._diagnostics = None

    @property
    def is_successful(self):
        """
        **[Required]** Gets the is_successful of this OntologyProjectParseResult.
        Whether all project Turtle files parsed without Jena errors.


        :return: The is_successful of this OntologyProjectParseResult.
        :rtype: bool
        """
        return self._is_successful

    @is_successful.setter
    def is_successful(self, is_successful):
        """
        Sets the is_successful of this OntologyProjectParseResult.
        Whether all project Turtle files parsed without Jena errors.


        :param is_successful: The is_successful of this OntologyProjectParseResult.
        :type: bool
        """
        self._is_successful = is_successful

    @property
    def status(self):
        """
        **[Required]** Gets the status of this OntologyProjectParseResult.
        Parse status.


        :return: The status of this OntologyProjectParseResult.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this OntologyProjectParseResult.
        Parse status.


        :param status: The status of this OntologyProjectParseResult.
        :type: str
        """
        self._status = status

    @property
    def revision(self):
        """
        Gets the revision of this OntologyProjectParseResult.
        Project content revision hash used for the parsed dataset.


        :return: The revision of this OntologyProjectParseResult.
        :rtype: str
        """
        return self._revision

    @revision.setter
    def revision(self, revision):
        """
        Sets the revision of this OntologyProjectParseResult.
        Project content revision hash used for the parsed dataset.


        :param revision: The revision of this OntologyProjectParseResult.
        :type: str
        """
        self._revision = revision

    @property
    def size_bytes(self):
        """
        Gets the size_bytes of this OntologyProjectParseResult.
        Aggregate size of parsed Turtle content in bytes.


        :return: The size_bytes of this OntologyProjectParseResult.
        :rtype: int
        """
        return self._size_bytes

    @size_bytes.setter
    def size_bytes(self, size_bytes):
        """
        Sets the size_bytes of this OntologyProjectParseResult.
        Aggregate size of parsed Turtle content in bytes.


        :param size_bytes: The size_bytes of this OntologyProjectParseResult.
        :type: int
        """
        self._size_bytes = size_bytes

    @property
    def parsed_file_count(self):
        """
        **[Required]** Gets the parsed_file_count of this OntologyProjectParseResult.
        Number of Turtle files parsed.


        :return: The parsed_file_count of this OntologyProjectParseResult.
        :rtype: int
        """
        return self._parsed_file_count

    @parsed_file_count.setter
    def parsed_file_count(self, parsed_file_count):
        """
        Sets the parsed_file_count of this OntologyProjectParseResult.
        Number of Turtle files parsed.


        :param parsed_file_count: The parsed_file_count of this OntologyProjectParseResult.
        :type: int
        """
        self._parsed_file_count = parsed_file_count

    @property
    def source_paths(self):
        """
        **[Required]** Gets the source_paths of this OntologyProjectParseResult.
        Project-relative Turtle source paths parsed into named graphs.


        :return: The source_paths of this OntologyProjectParseResult.
        :rtype: list[str]
        """
        return self._source_paths

    @source_paths.setter
    def source_paths(self, source_paths):
        """
        Sets the source_paths of this OntologyProjectParseResult.
        Project-relative Turtle source paths parsed into named graphs.


        :param source_paths: The source_paths of this OntologyProjectParseResult.
        :type: list[str]
        """
        self._source_paths = source_paths

    @property
    def diagnostics(self):
        """
        Gets the diagnostics of this OntologyProjectParseResult.
        Parser diagnostics returned by Apache Jena.


        :return: The diagnostics of this OntologyProjectParseResult.
        :rtype: list[oci.aidataplatform_dp.models.OntologyGraphPreviewDiagnostic]
        """
        return self._diagnostics

    @diagnostics.setter
    def diagnostics(self, diagnostics):
        """
        Sets the diagnostics of this OntologyProjectParseResult.
        Parser diagnostics returned by Apache Jena.


        :param diagnostics: The diagnostics of this OntologyProjectParseResult.
        :type: list[oci.aidataplatform_dp.models.OntologyGraphPreviewDiagnostic]
        """
        self._diagnostics = diagnostics

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
