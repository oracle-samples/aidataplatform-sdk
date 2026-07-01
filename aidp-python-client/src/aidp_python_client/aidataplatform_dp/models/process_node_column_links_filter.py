# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ProcessNodeColumnLinksFilter(object):
    """
    Optional filter criteria for process node column links.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ProcessNodeColumnLinksFilter object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param process_run_stage_id:
            The value to assign to the process_run_stage_id property of this ProcessNodeColumnLinksFilter.
        :type process_run_stage_id: str

        :param transformation:
            The value to assign to the transformation property of this ProcessNodeColumnLinksFilter.
        :type transformation: str

        :param display_name_contains:
            The value to assign to the display_name_contains property of this ProcessNodeColumnLinksFilter.
        :type display_name_contains: str

        """
        self.swagger_types = {
            'process_run_stage_id': 'str',
            'transformation': 'str',
            'display_name_contains': 'str'
        }

        self.attribute_map = {
            'process_run_stage_id': 'processRunStageId',
            'transformation': 'transformation',
            'display_name_contains': 'displayNameContains'
        }

        self._process_run_stage_id = None
        self._transformation = None
        self._display_name_contains = None

    @property
    def process_run_stage_id(self):
        """
        Gets the process_run_stage_id of this ProcessNodeColumnLinksFilter.
        Filters only the links for a particular stage in a multi-stage process.


        :return: The process_run_stage_id of this ProcessNodeColumnLinksFilter.
        :rtype: str
        """
        return self._process_run_stage_id

    @process_run_stage_id.setter
    def process_run_stage_id(self, process_run_stage_id):
        """
        Sets the process_run_stage_id of this ProcessNodeColumnLinksFilter.
        Filters only the links for a particular stage in a multi-stage process.


        :param process_run_stage_id: The process_run_stage_id of this ProcessNodeColumnLinksFilter.
        :type: str
        """
        self._process_run_stage_id = process_run_stage_id

    @property
    def transformation(self):
        """
        Gets the transformation of this ProcessNodeColumnLinksFilter.
        Limits the returned column links to those whose transformation exactly matches the
        supplied value.


        :return: The transformation of this ProcessNodeColumnLinksFilter.
        :rtype: str
        """
        return self._transformation

    @transformation.setter
    def transformation(self, transformation):
        """
        Sets the transformation of this ProcessNodeColumnLinksFilter.
        Limits the returned column links to those whose transformation exactly matches the
        supplied value.


        :param transformation: The transformation of this ProcessNodeColumnLinksFilter.
        :type: str
        """
        self._transformation = transformation

    @property
    def display_name_contains(self):
        """
        Gets the display_name_contains of this ProcessNodeColumnLinksFilter.
        Limits the returned column links to those where either the source or target column
        display name contains the supplied value, or where the parent artifact segment in the
        source or target column path contains the supplied value.


        :return: The display_name_contains of this ProcessNodeColumnLinksFilter.
        :rtype: str
        """
        return self._display_name_contains

    @display_name_contains.setter
    def display_name_contains(self, display_name_contains):
        """
        Sets the display_name_contains of this ProcessNodeColumnLinksFilter.
        Limits the returned column links to those where either the source or target column
        display name contains the supplied value, or where the parent artifact segment in the
        source or target column path contains the supplied value.


        :param display_name_contains: The display_name_contains of this ProcessNodeColumnLinksFilter.
        :type: str
        """
        self._display_name_contains = display_name_contains

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
