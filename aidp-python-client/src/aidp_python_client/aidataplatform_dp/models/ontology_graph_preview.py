# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyGraphPreview(object):
    """
    Bounded graph preview streamed from an Apache Jena TDB2 dataset for a design-time ontology Turtle file.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyGraphPreview object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param file:
            The value to assign to the file property of this OntologyGraphPreview.
        :type file: oci.aidataplatform_dp.models.OntologyGraphPreviewFile

        :param status:
            The value to assign to the status property of this OntologyGraphPreview.
        :type status: str

        :param graph:
            The value to assign to the graph property of this OntologyGraphPreview.
        :type graph: oci.aidataplatform_dp.models.OntologyGraphPreviewModel

        :param limits:
            The value to assign to the limits property of this OntologyGraphPreview.
        :type limits: oci.aidataplatform_dp.models.OntologyGraphPreviewLimits

        :param diagnostics:
            The value to assign to the diagnostics property of this OntologyGraphPreview.
        :type diagnostics: list[oci.aidataplatform_dp.models.OntologyGraphPreviewDiagnostic]

        :param unsupported_constructs:
            The value to assign to the unsupported_constructs property of this OntologyGraphPreview.
        :type unsupported_constructs: list[str]

        :param next_cursor:
            The value to assign to the next_cursor property of this OntologyGraphPreview.
        :type next_cursor: str

        :param next_parent_cursor:
            The value to assign to the next_parent_cursor property of this OntologyGraphPreview.
        :type next_parent_cursor: str

        """
        self.swagger_types = {
            'file': 'OntologyGraphPreviewFile',
            'status': 'str',
            'graph': 'OntologyGraphPreviewModel',
            'limits': 'OntologyGraphPreviewLimits',
            'diagnostics': 'list[OntologyGraphPreviewDiagnostic]',
            'unsupported_constructs': 'list[str]',
            'next_cursor': 'str',
            'next_parent_cursor': 'str'
        }

        self.attribute_map = {
            'file': 'file',
            'status': 'status',
            'graph': 'graph',
            'limits': 'limits',
            'diagnostics': 'diagnostics',
            'unsupported_constructs': 'unsupportedConstructs',
            'next_cursor': 'nextCursor',
            'next_parent_cursor': 'nextParentCursor'
        }

        self._file = None
        self._status = None
        self._graph = None
        self._limits = None
        self._diagnostics = None
        self._unsupported_constructs = None
        self._next_cursor = None
        self._next_parent_cursor = None

    @property
    def file(self):
        """
        **[Required]** Gets the file of this OntologyGraphPreview.

        :return: The file of this OntologyGraphPreview.
        :rtype: oci.aidataplatform_dp.models.OntologyGraphPreviewFile
        """
        return self._file

    @file.setter
    def file(self, file):
        """
        Sets the file of this OntologyGraphPreview.

        :param file: The file of this OntologyGraphPreview.
        :type: oci.aidataplatform_dp.models.OntologyGraphPreviewFile
        """
        self._file = file

    @property
    def status(self):
        """
        **[Required]** Gets the status of this OntologyGraphPreview.
        Preview status.


        :return: The status of this OntologyGraphPreview.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this OntologyGraphPreview.
        Preview status.


        :param status: The status of this OntologyGraphPreview.
        :type: str
        """
        self._status = status

    @property
    def graph(self):
        """
        **[Required]** Gets the graph of this OntologyGraphPreview.

        :return: The graph of this OntologyGraphPreview.
        :rtype: oci.aidataplatform_dp.models.OntologyGraphPreviewModel
        """
        return self._graph

    @graph.setter
    def graph(self, graph):
        """
        Sets the graph of this OntologyGraphPreview.

        :param graph: The graph of this OntologyGraphPreview.
        :type: oci.aidataplatform_dp.models.OntologyGraphPreviewModel
        """
        self._graph = graph

    @property
    def limits(self):
        """
        **[Required]** Gets the limits of this OntologyGraphPreview.

        :return: The limits of this OntologyGraphPreview.
        :rtype: oci.aidataplatform_dp.models.OntologyGraphPreviewLimits
        """
        return self._limits

    @limits.setter
    def limits(self, limits):
        """
        Sets the limits of this OntologyGraphPreview.

        :param limits: The limits of this OntologyGraphPreview.
        :type: oci.aidataplatform_dp.models.OntologyGraphPreviewLimits
        """
        self._limits = limits

    @property
    def diagnostics(self):
        """
        Gets the diagnostics of this OntologyGraphPreview.
        Parser or preview diagnostics.


        :return: The diagnostics of this OntologyGraphPreview.
        :rtype: list[oci.aidataplatform_dp.models.OntologyGraphPreviewDiagnostic]
        """
        return self._diagnostics

    @diagnostics.setter
    def diagnostics(self, diagnostics):
        """
        Sets the diagnostics of this OntologyGraphPreview.
        Parser or preview diagnostics.


        :param diagnostics: The diagnostics of this OntologyGraphPreview.
        :type: list[oci.aidataplatform_dp.models.OntologyGraphPreviewDiagnostic]
        """
        self._diagnostics = diagnostics

    @property
    def unsupported_constructs(self):
        """
        Gets the unsupported_constructs of this OntologyGraphPreview.
        Turtle/RDF constructs that were not fully represented in the preview.


        :return: The unsupported_constructs of this OntologyGraphPreview.
        :rtype: list[str]
        """
        return self._unsupported_constructs

    @unsupported_constructs.setter
    def unsupported_constructs(self, unsupported_constructs):
        """
        Sets the unsupported_constructs of this OntologyGraphPreview.
        Turtle/RDF constructs that were not fully represented in the preview.


        :param unsupported_constructs: The unsupported_constructs of this OntologyGraphPreview.
        :type: list[str]
        """
        self._unsupported_constructs = unsupported_constructs

    @property
    def next_cursor(self):
        """
        Gets the next_cursor of this OntologyGraphPreview.
        Cursor for fetching another graph slice.


        :return: The next_cursor of this OntologyGraphPreview.
        :rtype: str
        """
        return self._next_cursor

    @next_cursor.setter
    def next_cursor(self, next_cursor):
        """
        Sets the next_cursor of this OntologyGraphPreview.
        Cursor for fetching another graph slice.


        :param next_cursor: The next_cursor of this OntologyGraphPreview.
        :type: str
        """
        self._next_cursor = next_cursor

    @property
    def next_parent_cursor(self):
        """
        Gets the next_parent_cursor of this OntologyGraphPreview.
        Cursor for fetching another root or parent node page in hierarchy mode.


        :return: The next_parent_cursor of this OntologyGraphPreview.
        :rtype: str
        """
        return self._next_parent_cursor

    @next_parent_cursor.setter
    def next_parent_cursor(self, next_parent_cursor):
        """
        Sets the next_parent_cursor of this OntologyGraphPreview.
        Cursor for fetching another root or parent node page in hierarchy mode.


        :param next_parent_cursor: The next_parent_cursor of this OntologyGraphPreview.
        :type: str
        """
        self._next_parent_cursor = next_parent_cursor

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
