# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyGraphPreviewDiagnostic(object):
    """
    Parser or preview diagnostic.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyGraphPreviewDiagnostic object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param severity:
            The value to assign to the severity property of this OntologyGraphPreviewDiagnostic.
        :type severity: str

        :param message:
            The value to assign to the message property of this OntologyGraphPreviewDiagnostic.
        :type message: str

        :param line:
            The value to assign to the line property of this OntologyGraphPreviewDiagnostic.
        :type line: int

        :param column:
            The value to assign to the column property of this OntologyGraphPreviewDiagnostic.
        :type column: int

        """
        self.swagger_types = {
            'severity': 'str',
            'message': 'str',
            'line': 'int',
            'column': 'int'
        }

        self.attribute_map = {
            'severity': 'severity',
            'message': 'message',
            'line': 'line',
            'column': 'column'
        }

        self._severity = None
        self._message = None
        self._line = None
        self._column = None

    @property
    def severity(self):
        """
        **[Required]** Gets the severity of this OntologyGraphPreviewDiagnostic.

        :return: The severity of this OntologyGraphPreviewDiagnostic.
        :rtype: str
        """
        return self._severity

    @severity.setter
    def severity(self, severity):
        """
        Sets the severity of this OntologyGraphPreviewDiagnostic.

        :param severity: The severity of this OntologyGraphPreviewDiagnostic.
        :type: str
        """
        self._severity = severity

    @property
    def message(self):
        """
        **[Required]** Gets the message of this OntologyGraphPreviewDiagnostic.

        :return: The message of this OntologyGraphPreviewDiagnostic.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """
        Sets the message of this OntologyGraphPreviewDiagnostic.

        :param message: The message of this OntologyGraphPreviewDiagnostic.
        :type: str
        """
        self._message = message

    @property
    def line(self):
        """
        Gets the line of this OntologyGraphPreviewDiagnostic.

        :return: The line of this OntologyGraphPreviewDiagnostic.
        :rtype: int
        """
        return self._line

    @line.setter
    def line(self, line):
        """
        Sets the line of this OntologyGraphPreviewDiagnostic.

        :param line: The line of this OntologyGraphPreviewDiagnostic.
        :type: int
        """
        self._line = line

    @property
    def column(self):
        """
        Gets the column of this OntologyGraphPreviewDiagnostic.

        :return: The column of this OntologyGraphPreviewDiagnostic.
        :rtype: int
        """
        return self._column

    @column.setter
    def column(self, column):
        """
        Sets the column of this OntologyGraphPreviewDiagnostic.

        :param column: The column of this OntologyGraphPreviewDiagnostic.
        :type: int
        """
        self._column = column

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
