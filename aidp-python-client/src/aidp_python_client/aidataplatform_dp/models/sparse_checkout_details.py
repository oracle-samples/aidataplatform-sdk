# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SparseCheckoutDetails(object):
    """
    Sparse checkout configuration for a git repository. Only cone mode is supported. Specify only when creating a sparse git folder; sparse checkout cannot be enabled later for a non-sparse git folder. For sparse git folders, settings updates can change cone folder patterns but cannot enable or disable sparse checkout.
    """

    #: A constant which can be used with the mode property of a SparseCheckoutDetails.
    #: This constant has a value of "CONE"
    MODE_CONE = "CONE"

    def __init__(self, **kwargs):
        """
        Initializes a new SparseCheckoutDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param patterns:
            The value to assign to the patterns property of this SparseCheckoutDetails.
        :type patterns: list[str]

        :param mode:
            The value to assign to the mode property of this SparseCheckoutDetails.
            Allowed values for this property are: "CONE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type mode: str

        """
        self.swagger_types = {
            'patterns': 'list[str]',
            'mode': 'str'
        }
        self.attribute_map = {
            'patterns': 'patterns',
            'mode': 'mode'
        }
        self._patterns = None
        self._mode = None

    @property
    def patterns(self):
        """
        Gets the patterns of this SparseCheckoutDetails.
        Repository-root-relative folder paths to include in the sparse worktree. Cone patterns apply only to folders; root-level files in the repository are always materialized. Empty or omitted patterns materialize root-level files only.


        :return: The patterns of this SparseCheckoutDetails.
        :rtype: list[str]
        """
        return self._patterns

    @patterns.setter
    def patterns(self, patterns):
        """
        Sets the patterns of this SparseCheckoutDetails.
        Repository-root-relative folder paths to include in the sparse worktree. Cone patterns apply only to folders; root-level files in the repository are always materialized. Empty or omitted patterns materialize root-level files only.


        :param patterns: The patterns of this SparseCheckoutDetails.
        :type: list[str]
        """
        self._patterns = patterns

    @property
    def mode(self):
        """
        Gets the mode of this SparseCheckoutDetails.
        Sparse checkout matching mode. Git supports cone and non-cone sparse checkout pattern styles; AIDP supports cone mode only.

        Allowed values for this property are: "CONE", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The mode of this SparseCheckoutDetails.
        :rtype: str
        """
        return self._mode

    @mode.setter
    def mode(self, mode):
        """
        Sets the mode of this SparseCheckoutDetails.
        Sparse checkout matching mode. Git supports cone and non-cone sparse checkout pattern styles; AIDP supports cone mode only.


        :param mode: The mode of this SparseCheckoutDetails.
        :type: str
        """
        allowed_values = ["CONE"]
        if not value_allowed_none_or_none_sentinel(mode, allowed_values):
            mode = 'UNKNOWN_ENUM_VALUE'
        self._mode = mode

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
