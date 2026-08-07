# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ProcessNodeColumnLink(object):
    """
    A source-to-target column link that flows through a process node.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ProcessNodeColumnLink object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param source_column:
            The value to assign to the source_column property of this ProcessNodeColumnLink.
        :type source_column: oci.aidataplatform_dp.models.ProcessNodeColumnDetails

        :param target_column:
            The value to assign to the target_column property of this ProcessNodeColumnLink.
        :type target_column: oci.aidataplatform_dp.models.ProcessNodeColumnDetails

        :param transformation:
            The value to assign to the transformation property of this ProcessNodeColumnLink.
        :type transformation: str

        """
        self.swagger_types = {
            'source_column': 'ProcessNodeColumnDetails',
            'target_column': 'ProcessNodeColumnDetails',
            'transformation': 'str'
        }

        self.attribute_map = {
            'source_column': 'sourceColumn',
            'target_column': 'targetColumn',
            'transformation': 'transformation'
        }

        self._source_column = None
        self._target_column = None
        self._transformation = None

    @property
    def source_column(self):
        """
        **[Required]** Gets the source_column of this ProcessNodeColumnLink.

        :return: The source_column of this ProcessNodeColumnLink.
        :rtype: oci.aidataplatform_dp.models.ProcessNodeColumnDetails
        """
        return self._source_column

    @source_column.setter
    def source_column(self, source_column):
        """
        Sets the source_column of this ProcessNodeColumnLink.

        :param source_column: The source_column of this ProcessNodeColumnLink.
        :type: oci.aidataplatform_dp.models.ProcessNodeColumnDetails
        """
        self._source_column = source_column

    @property
    def target_column(self):
        """
        **[Required]** Gets the target_column of this ProcessNodeColumnLink.

        :return: The target_column of this ProcessNodeColumnLink.
        :rtype: oci.aidataplatform_dp.models.ProcessNodeColumnDetails
        """
        return self._target_column

    @target_column.setter
    def target_column(self, target_column):
        """
        Sets the target_column of this ProcessNodeColumnLink.

        :param target_column: The target_column of this ProcessNodeColumnLink.
        :type: oci.aidataplatform_dp.models.ProcessNodeColumnDetails
        """
        self._target_column = target_column

    @property
    def transformation(self):
        """
        **[Required]** Gets the transformation of this ProcessNodeColumnLink.
        Transformation type connecting the source column to the target column.


        :return: The transformation of this ProcessNodeColumnLink.
        :rtype: str
        """
        return self._transformation

    @transformation.setter
    def transformation(self, transformation):
        """
        Sets the transformation of this ProcessNodeColumnLink.
        Transformation type connecting the source column to the target column.


        :param transformation: The transformation of this ProcessNodeColumnLink.
        :type: str
        """
        self._transformation = transformation

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
